// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase {
  private final SparkFlex shooterSparkLeft;
  private final SparkFlex shooterSparkRight;
  /** Creates a new ShooterSubsytem. */
  public ShooterSubsystem() {
    shooterSparkLeft = new SparkFlex(10, MotorType.kBrushless);
    shooterSparkRight = new SparkFlex(11, MotorType.kBrushless);

    shooterSparkLeft.setInverted(true);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public void setShooterSpeed(double speed) {
    shooterSparkLeft.set(speed);
    shooterSparkRight.set(speed);
  }
}
