// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.ClimbConstants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class ClimbSubsystem extends SubsystemBase {

    private final CANSparkMax leftMotor = new CANSparkMax(ClimbConstants.kLeftClimbMotorPort, MotorType.kBrushless);
    private final CANSparkMax rightMotor = new CANSparkMax(ClimbConstants.kRightClimbMotorPort, MotorType.kBrushless);
    /** Creates a new ExampleSubsystem. 
   * @return */
  public void up() {
    leftMotor.set(1); 
    rightMotor.set(1);
  }
  public void down() {
    leftMotor.set(-1); 
    rightMotor.set(-1);
  }
  public void stop() {
    leftMotor.set(0); 
    rightMotor.set(0);
  }
}
