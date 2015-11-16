package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Quest Jelinek (Github: TofuTheBland) on 11/14/15.
 * Originally part of the FtcDriver project.
 */
public class MotorTest extends OpMode {
    DcMotor motorL;


    @Override
    public void init() {
        motorL = hardwareMap.dcMotor.get("motorR");
    }

    @Override
    public void loop() {
        motorL.setPower(1);


    }

    @Override
    public void stop() {
        motorL.setPower(1);

    }
}
