package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.RobotObjects.EPIC.Mecanum_Wheels;
import org.firstinspires.ftc.teamcode.RobotObjects.EPIC.Scanner;
import org.openftc.easyopencv.OpenCvCamera;
@Autonomous(name = "TestMotor")
public class TestMotor extends LinearOpMode {
//
    @Override
    public void runOpMode() throws InterruptedException {
        double distance = 0;
        Mecanum_Wheels mecanum = new Mecanum_Wheels(hardwareMap);
        mecanum.leftErrorAdjustment = 1;
        mecanum.parent = this;
        mecanum.IsAutonomous = true;
        mecanum.velocity = 400;
        mecanum.telemetry = this.telemetry;
        mecanum.initialize();




        waitForStart();
        //forward
        distance = 51;
        mecanum.encoderDrive(0.8,distance,distance,distance,distance,2);
        sleep(2000);
        mecanum.encoderDrive(0.8,-distance,-distance,-distance,-distance,2);



}}
