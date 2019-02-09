/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DriveManuallyCommand extends Command {
  public DriveManuallyCommand() {
    // Use requires() here to declare subsystem dependencies
 requires(Robot.drivesubsystem); //this is command is commanding the robot subsystem
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() { //this is used for initializing values, reseting encoders & gyros, etc.
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() { //gets called everything command loop fires, rus over and over again
    // may be used to get the value of gryo, joysticks, encoders, etc.

    double move = -Robot.oi.stick.getY(); //move variable controls forward and backwards movement (Y axis is up and down!)
    double turn = Robot.oi.stick.getX(); //move variable controls left and right movement (X xis is left and right!)
    Robot.drivesubsystem.manualDrive(move, turn);

  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() { // checks if something is finished, or has reached it's value
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
    end();
  }
}
