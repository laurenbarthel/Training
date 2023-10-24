// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.DemandType;
import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain extends SubsystemBase {
  /** Creates a new DriveTrain. */

  private TalonSRX leftMotor = new TalonSRX(1);
  private TalonSRX rightMotor = new TalonSRX(2);
  private TalonSRX topMotor = new TalonSRX(3);



  

  public DriveTrain() {
    topMotor.configFactoryDefault();
    leftMotor.configFactoryDefault();
    rightMotor.configFactoryDefault();
    rightMotor.setInverted(true);


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }

  public void drive(double leftSpeed, double rightSpeed){
    leftMotor.set(TalonSRXControlMode.PercentOutput, leftSpeed);
    rightMotor.set(TalonSRXControlMode.PercentOutput, rightSpeed);
    

  }
}
