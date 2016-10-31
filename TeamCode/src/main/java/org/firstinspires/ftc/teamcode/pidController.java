public class PID{

float proportionalConstant=0;
float integralConstant=0;
float derivitiveConstant=0;
intTarget=100;
float proportionalCorrection;
float integralCorrection;
float deriviiveCorrection;
float Slopeofderivitive;
float Cuumulativeerror=0;
float maxCorrection=100;
float minCorrection=15;

public void Correction(){
    while(opModeisActive()){
    error=Math.abs(target-getIntegratedZheading);
    proportionalCorrection=proportionalConstant*error;
    
    Cuumulativeerror+=error;
    integralCorrection=integralConstant*cuumulativeerror;
    
    Slopeofderivitive=error-lasterror;
    derivitivecorrection=Slopeofderivitive*derivitiveConstant;
    lasterror=error
    
    Correction=ProportionalCorrectoin+integralCorrection+derivitivCorrection;
    
    if Correction>MaxCorrection{Correction=MaxCorrection}
      else if (Correction<MinCorrection){Correction=MinCorrection}
        else Correction=Correction
    
    if (getIntegratedZheading>Target){
      FrontLeft.setPower(Power+Correction)
      FrontRight.setPower(Power-Correction)
      BackLeft.setPower(Power+Correction)
      BackRight.setPower(Power-Correction)}
    else if (Target<getIntegratedZheading){
      FrontLeft.setPower(Power-Correction)
      FrontRight.setPower(Power+Correction)
      BackLeft.setPower(Power-Correction)
      BackRight.setPower(Power+Correction)}
    else {
      FrontLeft.setPower(Power-Correction)
      FrontRight.setPower(Power+Correction)
      BackLeft.setPower(Power-Correction)
      BackRight.setPower(Power+Correction)
    }
    }
    
    
    }
  }
}
