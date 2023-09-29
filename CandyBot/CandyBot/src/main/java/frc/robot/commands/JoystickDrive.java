// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import javax.swing.Spring;

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
    double leftSpeed = joystick.getRawAxis(1) * -0.5;
    double rightSpeed = joystick.getRawAxis(5)* -0.7;
    driveTrain.drive(leftSpeed, rightSpeed);
    if(joystick.getRawButton(6)){
      spinSubsystem.setTopMotor(-0.6);
    }else if(joystick.getRawButton(1)) {
      spinSubsystem.setTopMotor(0.6);
    }else{
      spinSubsystem.setTopMotor(0);
    }
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
