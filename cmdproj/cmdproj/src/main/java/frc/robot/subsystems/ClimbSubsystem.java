// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimbSubsystem extends SubsystemBase {

    private final Spark climbMotor = new Spark(2);
    private final Encoder encoder = new Encoder(4, 5);
    private final double kEncoderTick2Meter = 1.0 / 4096.0 * 0.1 * Math.PI;
    
    public double getEncoderMeters() {
        return encoder.get() * kEncoderTick2Meter;
    }
  /** Creates a new ExampleSubsystem. */
  public ClimbSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
  public void setMotor(double speed) {
    ClimbMotor.set(speed);
  }
  @Override
  public void periodic() {
      SmartDashboard.putnumber("Climb encoder value" , getEncoderMeters());
  }
}
