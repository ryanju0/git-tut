package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.FlywheelConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkMaxPIDController;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class FlywheelSubsystem extends SubsystemBase{
    private PIDController FlywheelPID;
    private final CANSparkMax FlywheelMotor = new CANSparkMax(FlywheelConstants.kFlywheelMotorPort, MotorType.kBrushless);
    private final CANSparkMax FlywheelSlave = new CANSparkMax(FlywheelConstants.kFlywheelMotorPort, MotorType.kBrushless);
    private RelativeEncoder flywheelEncoder;
    private PIDController controller;
    private final double kFF = 0.0075;
    private final double kP = 0.1;        
    private final double setpoint = 300;
    public void Flywheel(){
        flywheelEncoder = FlywheelMotor.getEncoder();
        controller = new PIDController (kP, 0.0, 0.0);
        FlywheelSlave.follow(FlywheelMotor, true);

    }
    
    public void shoot(){
        FlywheelMotor.setVoltage(controller.calculate(flywheelEncoder.getVelocity(), setpoint)+kFF);
    }
    public void stop(){
        FlywheelMotor.set(0);
    }
}
