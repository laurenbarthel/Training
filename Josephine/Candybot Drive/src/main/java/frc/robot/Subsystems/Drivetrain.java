// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  TalonSRX leftMotor = new TalonSRX(1);
  TalonSRX rightMotor = new TalonSRX(2);

  Herbert herbert = new Herbert();



  public Drivetrain() {
    leftMotor.configFactoryDefault();
    rightMotor.configFactoryDefault();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void drive(double leftInput, double rightInput){
    leftMotor.set(ControlMode.PercentOutput, leftInput);
    rightMotor.set(ControlMode.PercentOutput, rightInput);
  }

}
