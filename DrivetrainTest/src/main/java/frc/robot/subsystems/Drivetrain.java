// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */


  TalonFX leftMotor = new TalonFX(0);
  TalonFX rightMotor = new TalonFX(1);



  public Drivetrain() {
    leftMotor.configFactoryDefault();
    rightMotor.configFactoryDefault();

    leftMotor.setInverted(TalonFXInvertType.Clockwise);

  }

  @Override
  public void periodic() {

    // This method will be called once per scheduler run
  }

  public void drive(double leftSpeed, double rightSpeed){
    leftMotor.set(ControlMode.PercentOutput, leftSpeed);
    rightMotor.set(ControlMode.PercentOutput, rightSpeed);
  }

}
