// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class JoystickDrive extends CommandBase {

  Drivetrain drivetrain;
  Joystick leftJoystick;
  Joystick rightJoystick;


  /** Creates a new JoystickDrive. */
  public JoystickDrive(Drivetrain drivetrain, Joystick leftJoystick, Joystick rightJoystick) {
    addRequirements(drivetrain);
    this.drivetrain = drivetrain;
    this.leftJoystick = leftJoystick;
    this.rightJoystick = rightJoystick; 
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.drive(leftJoystick.getY(), rightJoystick.getY());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
