// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.motorontheside;

public class SideMotorControl extends CommandBase {
  /** Creates a new sidemotor. */
  motorontheside motoronthesides;
  Joystick joystick;
  public SideMotorControl(motorontheside _motorontheside, Joystick _joystick) {
    motoronthesides = _motorontheside;
    joystick = _joystick;
    addRequirements(motoronthesides);

    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed = joystick.getY();
    motoronthesides.setMotorPower(speed);
  
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
