// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SpinSubsystem extends SubsystemBase {
  /** Creates a new SpinSubsystem. */
  private TalonFX topMotor = new TalonFX(3);


  public SpinSubsystem() {
    topMotor.configFactoryDefault();

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setTopMotor(double Speed){

    topMotor.set(ControlMode.PercentOutput, -Speed);
    
    
    
  }
    
}
