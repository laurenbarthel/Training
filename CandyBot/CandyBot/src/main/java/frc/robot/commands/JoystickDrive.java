// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;
import frc.robot.subsystems.SpinSubsystem;

public class JoystickDrive extends CommandBase {
  /** Creates a new JoystickDrive. */

  Joystick joystick;

DriveTrain driveTrain;

SpinSubsystem spinSubsystem;

  public JoystickDrive(DriveTrain driveTrain, SpinSubsystem spinSubsystem, Joystick joystick) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(driveTrain);

    addRequirements(spinSubsystem);

    this.joystick = joystick;
    this.driveTrain = driveTrain;
    this.spinSubsystem = spinSubsystem;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double ySpeed = (Math.abs(joystick.getRawAxis(2))*joystick.getRawAxis(2)) * 0.5;
    double xSpeed = Math.abs(joystick.getRawAxis(1)) * joystick.getRawAxis(1);
    driveTrain.drive(ySpeed, xSpeed);
    spinSubsystem.setTopMotor(joystick.getRawAxis(5) * 0.6);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    driveTrain.drive(0,0); 
    
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
