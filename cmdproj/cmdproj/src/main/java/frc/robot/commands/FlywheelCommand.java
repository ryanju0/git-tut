package frc.robot.commands;

import frc.robot.subsystems.FlywheelSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;



public class FlywheelCommand extends CommandBase{
    private final FlywheelSubsystem flywheelsubsystem;
    public FlywheelCommand(FlywheelSubsystem flywheelsubsystem) {
        this.flywheelsubsystem = flywheelsubsystem;
    }

    @Override
    public void initialize() {
        System.out.println("flywheels started");   
    }

    @Override
    public void execute() {
    FlywheelSubsystem.shootFar();
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
}