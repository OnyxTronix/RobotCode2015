// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// C++ from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


#include "OI.h"

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INCLUDES
#include "SmartDashboard/SmartDashboard.h"
#include "Commands/Auto1Tote.h"
#include "Commands/AutoAllBoxes.h"
#include "Commands/AutoDriveToBox.h"
#include "Commands/AutoInsertAndLifeToLevel2.h"
#include "Commands/AutoInsertAndLiftToLevel1.h"
#include "Commands/AutoTurnLeft.h"
#include "Commands/CloseArms.h"
#include "Commands/CloseWheels.h"
#include "Commands/DriveToAutozone.h"
#include "Commands/DriveWithJoystick.h"
#include "Commands/GeneralSetpointCommand.h"
#include "Commands/GeneralStackevatorCommand.h"
#include "Commands/InsertCrate.h"
#include "Commands/InsertWithWheels.h"
#include "Commands/LiftByJoystick.h"
#include "Commands/LiftToLevel1.h"
#include "Commands/LiftToLevel2.h"
#include "Commands/Lower.h"
#include "Commands/OpenAndCloseWheels.h"
#include "Commands/OpenArms.h"
#include "Commands/OpenWheels.h"
#include "Commands/Raise.h"
#include "Commands/RemoveWithWheels.h"
#include "Commands/ResetElevator.h"
#include "Commands/RotateLeft.h"
#include "Commands/RotateRight.h"
#include "Commands/StartCompressor.h"
#include "Commands/StopCollectorWheels.h"
#include "Commands/StopCompressor.h"
#include "Commands/Turn90DegreesRight.h"

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=INCLUDES

OI::OI() {
	// Process operator interface input here.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

	functionStick = new Joystick(2);
	
	stopComp = new JoystickButton(functionStick, 7);
	stopComp->WhenPressed(new StopCompressor());
	startComp = new JoystickButton(functionStick, 8);
	startComp->WhenPressed(new StartCompressor());
	close = new JoystickButton(functionStick, 6);
	close->WhenPressed(new CloseArms());
	open = new JoystickButton(functionStick, 5);
	open->WhenPressed(new OpenArms());
	level1 = new JoystickButton(functionStick, 3);
	level1->WhenPressed(new LiftToLevel1());
	liftWithJoystickButton = new JoystickButton(functionStick, 2);
	liftWithJoystickButton->WhenPressed(new LiftByJoystick());
	level2 = new JoystickButton(functionStick, 4);
	level2->WhenPressed(new LiftToLevel2());
	resetButton = new JoystickButton(functionStick, 1);
	resetButton->WhenPressed(new ResetElevator());
	driveStick = new Joystick(1);
	
	openWheelsButton = new JoystickButton(driveStick, 4);
	openWheelsButton->WhenPressed(new OpenWheels());
	closeWheelsButton = new JoystickButton(driveStick, 3);
	closeWheelsButton->WhenPressed(new CloseWheels());
	stopWheelsButton = new JoystickButton(driveStick, 2);
	stopWheelsButton->WhenPressed(new StopCollectorWheels());
	insertCrateButton = new JoystickButton(driveStick, 1);
	insertCrateButton->WhenPressed(new InsertCrate());
	rotateRightButton = new JoystickButton(driveStick, 6);
	rotateRightButton->WhileHeld(new RotateRight());
	rotateLeftButton = new JoystickButton(driveStick, 5);
	rotateLeftButton->WhileHeld(new RotateLeft());
     

        // SmartDashboard Buttons
	SmartDashboard::PutData("StartCompressor", new StartCompressor());

	SmartDashboard::PutData("StopCompressor", new StopCompressor());

	SmartDashboard::PutData("OpenArms", new OpenArms());

	SmartDashboard::PutData("CloseArms", new CloseArms());

	SmartDashboard::PutData("InsertWithWheels", new InsertWithWheels());

	SmartDashboard::PutData("RemoveWithWheels", new RemoveWithWheels());

	SmartDashboard::PutData("OpenWheels", new OpenWheels());

	SmartDashboard::PutData("CloseWheels", new CloseWheels());

	SmartDashboard::PutData("StopCollectorWheels", new StopCollectorWheels());

	SmartDashboard::PutData("Turn90DegreesRight", new Turn90DegreesRight());

	SmartDashboard::PutData("DriveToAutozone", new DriveToAutozone());

	SmartDashboard::PutData("Auto1Tote", new Auto1Tote());

	SmartDashboard::PutData("InsertCrate", new InsertCrate());

	SmartDashboard::PutData("OpenAndCloseWheels", new OpenAndCloseWheels());

	SmartDashboard::PutData("AutoInsertAndLiftToLevel1", new AutoInsertAndLiftToLevel1());

	SmartDashboard::PutData("AutoInsertAndLifeToLevel2", new AutoInsertAndLifeToLevel2());

	SmartDashboard::PutData("AutoAllBoxes", new AutoAllBoxes());

	SmartDashboard::PutData("AutoDriveToBox", new AutoDriveToBox());

	SmartDashboard::PutData("AutoTurnLeft", new AutoTurnLeft());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
}

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS

Joystick* OI::getfunctionStick() {
	return functionStick;
}

Joystick* OI::getdriveStick() {
	return driveStick;
}

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
