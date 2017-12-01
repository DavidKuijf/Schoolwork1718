#include <Wire.h>
#include <MultiFuncShield.h>

const int buttonPin = A1;              // pushbutton is aangesloten op A1
const long interval = 2000;            //hoelang je de tijd hebt nadat je de knop voor het laatst hebt ingedrukt
const long debouncedelay = 100;        //de duur van de debounce
const int ledD1 = 13;                  //declaratie van de ledpins
const int ledD2 = 12;
const int ledD3 = 11;
const int ledD4 = 10;

char hexarray[] = {"0123456789abcdef"};//de array voor hex translation
int buttonState = 0;                   //variabele voor het bijhouden van de buttonstate
unsigned long previousMillis = 0;      //variabele voor de tijd van de vorige iteration
int counter = 0;                       //variable voor het aantal keer dat de pushbutton is ingedrukt
unsigned long lastDebounceTime = 0;    // the last time the output pin was toggled
unsigned long debounceDelay = 50;      // the debounce time; increase if the output flickers
int currentscore = 0;                  //variabele voor het bijhouden van de score
int randomint = 0;                     //variable voor het bijhouden van het random getal

  void convert(int input){             //maakt van een decimaal getal bineare output op led d1-d4
    digitalWrite(ledD4, HIGH);         //reset van de leds
    digitalWrite(ledD3, HIGH);
    digitalWrite(ledD2, HIGH);
    digitalWrite(ledD1, HIGH);

   if (input-16 >= 0){                //if voor 16
     //digitalWrite(ledD4, LOW);
     input = input -16;
   }
      
   if (input-8 >= 0){                 //if voor 8
      digitalWrite(ledD4, LOW);
      input = input -8;
   }
  if (input-4 >= 0){                  //if voor 4
     digitalWrite(ledD3, LOW);
     input = input -4;
  }
  if (input-2 >= 0){                  //if voor 2
     digitalWrite(ledD2, LOW);
     input = input -2;
  }
  if (input-1 >= 0){                  //if voor 1
     digitalWrite(ledD1, LOW);
     input = input -1;
  }
  
  
}

void setup() {
  pinMode(buttonPin, INPUT);        //sets A1 to input
  //Serial.begin(9600);               //open serial for bugtesting
  Timer1.initialize();              //make a timer happen?
  MFS.initialize(&Timer1);          //make a timer happen?
  randomSeed(analogRead(0));        //read a seed for randomint
  
}


void loop() {
 
 int reading = digitalRead(buttonPin);                    //read pushbuttonstate
 unsigned long currentMillis = millis();                  //set currentmillis to current millis ;)
    
 if ((millis() - lastDebounceTime) > debounceDelay) {     //als debounce delay grooter is dan verstreken tijd do this
   
    if (reading != buttonState) {                         //als pushbutton niet hezelfde is als vorige keer do this
      buttonState = reading;

       if (buttonState == LOW) {                          //als pushbutton ingedrukt is do this
         currentscore = currentMillis - previousMillis;   //set the score in case user wins
         previousMillis = currentMillis;                
         counter++;                                       //increment the counter
         MFS.write("    ");                               //Clear MFS 7-seg led
         MFS.write(hexarray[counter],3);                  //Translate decimal to hex

    if (counter >= 15){                                   //prevent overflow
      counter = 0;
    }
    }
    }
 }
 
  if (currentMillis - previousMillis >= interval) {       //make sure to wait 2 seconds
     previousMillis = currentMillis;
    
    if (counter == randomint){                            //checking if user won
      MFS.write(currentscore);                            //print score for 10 seconds
      delay(10000);   
      MFS.write("    ");                                  //Clear MFS 7-seg led
      counter = 0;                                        //set counter to 0
    }
    
    randomint = random(1,15);                             //make a new random number
    //Serial.println(randomint);                            //print for debugging
    convert(randomint);                                   //Show random int in bineary on the 4 leds
    
   
     }
  }
 

  

