package frc.robot.commands;

import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;



public class FlywheelCommand extends CommandBase{
    private final FlywheelSubsystem FlywheelSubsystem;
    public FlywheelEnum state;
    public FlywheelCommand(FlywheelSubsystem flywheelsubsystem) {
        this.FlywheelSubsystem = flywheelsubsystem;
    }
    public FlywheelCommand(FlywheelSubsystem flywheel, FlywheelEnum state){
        this.FlywheelSubsystem = flywheel;
        this.state = state;
    }
    @Override
    public void initialize() {
        System.out.println("flywheels started");   
    }

    @Override
    public void execute() {
    FlywheelSubsystem.shoot();
    }

    @Override
    public void end(boolean interrupted) {
    FlywheelSubsystem.stop();
    System.out.println("flywheels ended");
    }

    @Override
    public boolean isFinished() {
    return false;
    }
    public enum FlywheelEnum{
        ON,
        OFF
    }
}