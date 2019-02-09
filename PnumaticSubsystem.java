/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.OI;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;
import edu.wpi.first.wpilibj.Compressor;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class PnumaticSubsystem extends Subsystem {
    Compressor c = new Compressor(0);
  

    
    
    public void c_on(){
      //sets compresser to on 
    c.setClosedLoopControl(true);
  }
  public void c_off(){
      //sets comppresser to off
    c.setClosedLoopControl(false);
  }
  public void compressor_b_press(){
   //   if(OI.)
  }

  @Override
  public void initDefaultCommand() {
  
    //  OI.button7.whileHeld(new Compressor_control());
  
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}