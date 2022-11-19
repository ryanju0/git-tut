package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.FlywheelConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class FlywheelSubsystem extends SubsystemBase{
    private SparkMaxPIDController FlywheelPID;
    private final CANSparkMax FlywheelMotor = new CANSparkMax(FlywheelConstants.kFlywheelMotorPort, MotorType.kBrushless);
    public void Flywheel(){
        FlywheelPID = FlywheelMotor.getPIDController();
        FlywheelPID.setFF(FlywheelConstants.kFF);
        FlywheelPID.setP(FlywheelConstants.kP);
        FlywheelPID.setI(FlywheelConstants.kI);
        FlywheelPID.setD(FlywheelConstants.kD);
    }
    public void shootFar(){
        FlywheelMotor.set(10);
    }
    public void shootMid(){
        FlywheelMotor.set(5);
    }
    public void shootClose(){
        FlywheelMotor.set(1);
    }
    public void stop(){
        FlywheelMotor.set(0);
    }
}
