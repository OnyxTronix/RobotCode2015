// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// C++ from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


#ifndef STACKEVATOR_H
#define STACKEVATOR_H

#include "Commands/PIDSubsystem.h"
#include "WPILib.h"

/**
 *
 *
 * @author ExampleAuthor
 */
class Stackevator: public PIDSubsystem {
 public:
	// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	AnalogInput* rangeFinder;
	DigitalInput* bottom;
	Encoder* encoder;
	SpeedController* motor;
	DigitalInput* top;
	// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	Stackevator();
	double ReturnPIDInput();
	void UsePIDOutput(double output);
	void InitDefaultCommand();
};

#endif