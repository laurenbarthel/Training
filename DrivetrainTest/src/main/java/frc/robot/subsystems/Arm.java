// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import javax.swing.text.Position;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXInvertType;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Arm extends SubsystemBase {
  /** Creates a new Arm. */

  TalonFX baseMotor = new TalonFX(5);
  TalonFX followerMotor = new TalonFX(6);

  public Arm() {
    baseMotor.configFactoryDefault();
    followerMotor.configFactoryDefault();

    followerMotor.follow(baseMotor);


    baseMotor.setInverted(TalonFXInvertType.Clockwise);
    followerMotor.setInverted(TalonFXInvertType.FollowMaster);

    baseMotor.config_kP(0, 1);
    baseMotor.configClosedLoopPeakOutput(0, 0.5);
    baseMotor.configClosedloopRamp(1);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }


  public void setArmState(int state){
    switch(state){
      case 1:
        baseMotor.set(ControlMode.Position, 100);
        break;
      case 2:
        baseMotor.set(ControlMode.Position, 200);
        break;
      case 3:
        baseMotor.set(ControlMode.Position, 300);
        break;
      default:
        baseMotor.set(ControlMode.Position, 0);
        break;
    }

  }
}
