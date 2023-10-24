// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.JoystickDrive;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  private TalonFX leftMotor = new TalonFX(1);

  private TalonFX rightMotor = new TalonFX(2);

  public Drivetrain() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    
  }
  public void drive(double leftSpeed, double rightSpeed) {
    leftMotor.set(TalonFXControlMode.PercentOutput, leftSpeed);
    rightMotor.set(TalonFXControlMode.PercentOutput, rightSpeed);
  }

  public void stop() {
    leftMotor.set(TalonFXControlMode.PercentOutput, 0);
    rightMotor.set(TalonFXControlMode.PercentOutput, 0);
  }

}