package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

public class Index extends SubsystemBase {

    private Spark indexMotor1 = new Spark(IntakeConstants.kLeftMotorPort);
    private Spark indexMotor2 = new Spark(IntakeConstants.kRightMotorPort);
    
    public Index() {
    }

    @Override
    public void periodic() {
    }

    public void setPosition(boolean open) {
        if (open) {
            indexMotor1.set(IntakeConstants.kOpenSpeed);
            indexMotor2.set(IntakeConstants.kOpenSpeed);
        } else {
            indexMotor1.set(IntakeConstants.kCloseSpeed);
            indexMotor2.set(IntakeConstants.kCloseSpeed);
        }
    }
}

