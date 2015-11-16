package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;


/**
 * TODO Created by Quest Jelinek on 10/13/2015.
 * GitHub: TofuTheBland || https://github.com/TofuTheBland
 */
public class TeleOp extends OpMode {
    // TODO Initiate all variables
    DcMotor motorR; //Forward Left
    DcMotor motorL;

    Float driver_gamepad_x;
    Float driver_gamepad_y;


    @Override
    public void init() {
        // TODO Placeholder for hardware mapping, motor names may change
        motorR = hardwareMap.dcMotor.get("motorR");
        motorL = hardwareMap.dcMotor.get("motorL");

        //Added this for the lads

    }

    public void forward() {
        //For the method .setPower() pass a value from -1 to 1 (inc. 0)
        motorR.setPower(1);
        motorL.setPower(1);
    }
    public void backward() {
        //For the method .setPower() pass a value from -1 to 1 (inc. 0)
        motorR.setPower(-1);
        motorL.setPower(-1);
    }
    public void left() {
        //For the method .setPower() pass a value from -1 to 1 (inc. 0)
        motorR.setPower(1);
        motorL.setPower(-1);
    }

    public void right(){
        motorR.setPower(-1);
        motorL.setPower(1);
    }

    @Override
    public void loop() {
        //TODO Quali sono i controller di valori restituti?
        driver_gamepad_x = -gamepad1.left_stick_x;
        driver_gamepad_y = -gamepad1.left_stick_y;

        if(driver_gamepad_y > 0) {forward();}
        else if (driver_gamepad_y < 0) {backward();}
        else if (driver_gamepad_x > 0) {left();}
        else if (driver_gamepad_x < 0) {right();}
        else {
            motorR.setPower(0);
            motorL.setPower(0);
        }
    }
}

//TODO Add a separate library for movement functions and add smoothing function
