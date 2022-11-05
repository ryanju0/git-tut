package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.Index;

public class IntakeCommand extends CommandBase {

    private final IntakeSubsystem intakeSubsystem;
    private final boolean open;
    private final Index index;

    public IntakeCommand(IntakeSubsystem intakeSubsystem, boolean open, Index index) {
        this.open = open;
        this.intakeSubsystem = intakeSubsystem;
        this.index = index;
        addRequirements(intakeSubsystem);
    }

    @Override
    public void initialize() {
        System.out.println("IntakeCommand started!");
    }

    @Override
    public void execute() {
        intakeSubsystem.setPosition(open);
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("IntakeCommand ended!");
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}