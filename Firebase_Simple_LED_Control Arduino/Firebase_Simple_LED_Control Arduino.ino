/*
  Simple Led Control using Firebase
  Modified FirebaseDemo_ESP8266

  Circuit : Connect a LED to D0 pin of NodeMCU.
  
 */

#include <ESP8266WiFi.h>
#include <FirebaseArduino.h>
#define FIREBASE_HOST ""                                     //Your Firebase Project URL goes here without "http:" , "\" and "/"
#define FIREBASE_AUTH ""                                    //Your Firebase Database Secret goes here
#define WIFI_SSID ""                                       //Your WiFi SSID
#define WIFI_PASSWORD ""                                  //Your WiFi Password.
int value = 0;

void setup() {
  Serial.begin(9600);
  pinMode(D0, OUTPUT);
  WiFi.begin(WIFI_SSID, WIFI_PASSWORD);
  Serial.print("connecting");
  while (WiFi.status() != WL_CONNECTED) {
    Serial.print(".");
    delay(500);
  }
   Serial.println();
  Serial.print("connected: ");
  Serial.println(WiFi.localIP());
  Firebase.begin(FIREBASE_HOST, FIREBASE_AUTH);
  Firebase.set("LED_State", 0);                         //Creating Data location LED_State in firebase and initilizing as 0
}

void loop() {
  value = Firebase.getInt("LED_State");                 //Pulling value from firebase and storing to variable  
  if (value==1) {
    Serial.println("LED On");
    digitalWrite(D0,HIGH);  
    return;
    delay(10);
  }
  else {
    Serial.println("LED Off");
    digitalWrite(D0,LOW);  
    return;
  }
}
