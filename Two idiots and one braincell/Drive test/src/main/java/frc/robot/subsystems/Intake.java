// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {

TalonFX intakeMotor = new TalonFX(2);

  /** Creates a new Intake. */
  public Intake() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

 
  /**
   * Runs the intake motor at a specific % output 
   * @param intakeSpeed percent output
   */
  public void runIntake(double intakeSpeed){
    intakeMotor.set(TalonFXControlMode.PercentOutput, intakeSpeed);
  }

  public void stop(){
    intakeMotor.set(TalonFXControlMode.PercentOutput, 0);
  }
}
