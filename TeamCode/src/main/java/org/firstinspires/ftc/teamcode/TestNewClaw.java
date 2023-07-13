package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.SampleCode.RobotObjects.EPIC.Claw2023;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
@Disabled
@TeleOp(name = "TestNewClaw")
public class TestNewClaw extends LinearOpMode{

    public Claw2023 finger;

    @Override
    public void runOpMode() throws InterruptedException {
        finger = new Claw2023(hardwareMap);
        finger.telemetry = telemetry;
        finger.parent = this;
        finger.grab();
        waitForStart();
        while(opModeIsActive()){
        finger.release();
        sleep(2000);
        finger.grab();
        sleep(2000);

    }
}}
