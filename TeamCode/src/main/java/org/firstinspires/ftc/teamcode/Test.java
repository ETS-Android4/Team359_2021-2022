package org.firstinspires.ftc.teamcode;

import com.arcrobotics.ftclib.hardware.ServoEx;
import com.arcrobotics.ftclib.hardware.SimpleServo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
@TeleOp(name = "Test")
public class Test extends LinearOpMode {
    @Override
    public void init() {

    }
    ServoEx servo = null;
    servo = new SimpleServo(hardwareMap, "servo",1, 180);

    @Override
    public void runOpMode(){
        servo = rotateByangle(1);
    }



}
