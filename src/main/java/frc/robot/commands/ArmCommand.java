// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.RobotContainer;
import frc.robot.subsystems.ArmSubsystem;

public class ArmCommand extends Command {
  /** Creates a new ArmCommand. */

  private final ArmSubsystem m_armSubsystem;
  private final RobotContainer m_RobotContainer;

  public ArmCommand(ArmSubsystem armSubsystem, RobotContainer robotContainer) {
    m_armSubsystem = armSubsystem;
    m_RobotContainer = robotContainer;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if(m_RobotContainer.m_buttonBox.getPOV() == 0) {
      m_armSubsystem.armMotorUp();
    } else if (m_RobotContainer.m_buttonBox.getPOV() == 180) {
      m_armSubsystem.armMotorDown();
    } else m_armSubsystem.armOff();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}