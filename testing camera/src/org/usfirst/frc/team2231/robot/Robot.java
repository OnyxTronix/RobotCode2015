package org.usfirst.frc.team2231.robot;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.ImageType;
import com.ni.vision.NIVision.RGBValue;
import com.ni.vision.NIVision.Range;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.image.BinaryImage;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.vision.AxisCamera;
import edu.wpi.first.wpilibj.vision.USBCamera;

public class Robot extends SampleRobot {

	NIVision.Range TOTE_HUE_RANGE = new NIVision.Range(100, 150);	//Default hue range for yellow tote
	NIVision.Range TOTE_SAT_RANGE = new NIVision.Range(0, 255);	//Default saturation range for yellow tote
	NIVision.Range TOTE_VAL_RANGE = new NIVision.Range(120, 255);	//Default value range for yellow tote

	AxisCamera camera;
	USBCamera camera2;
    
	//Images
	Image frame;
	Image binaryFrame;
	int imaqError;

    public void robotInit() {

        // open the camera at the IP address assigned. This is the IP address that the camera
        // can be accessed through the web interface.
        camera = new AxisCamera("10.22.31.11");
        camera2 = new USBCamera("cam0");
        camera2.openCamera();
        camera2.startCapture();
        
        // create images
		frame = NIVision.imaqCreateImage(ImageType.IMAGE_RGB, 0);
		binaryFrame = NIVision.imaqCreateImage(ImageType.IMAGE_U8, 0);
		
		//Put default values to SmartDashboard so fields will appear
		SmartDashboard.putNumber("Tote hue min", TOTE_HUE_RANGE.minValue);
		SmartDashboard.putNumber("Tote hue max", TOTE_HUE_RANGE.maxValue);
		SmartDashboard.putNumber("Tote sat min", TOTE_SAT_RANGE.minValue);
		SmartDashboard.putNumber("Tote sat max", TOTE_SAT_RANGE.maxValue);
		SmartDashboard.putNumber("Tote val min", TOTE_VAL_RANGE.minValue);
		SmartDashboard.putNumber("Tote val max", TOTE_VAL_RANGE.maxValue);
    }

    public void operatorControl() {
  
        while (isOperatorControl() && isEnabled()) {

        		camera.getImage(frame);
				//Threshold the image looking for yellow (tote color)
				NIVision.imaqColorThreshold(binaryFrame, frame, 255, NIVision.ColorMode.HSL, TOTE_HUE_RANGE, TOTE_SAT_RANGE, TOTE_VAL_RANGE);
				
				RGBValue colorTable = new RGBValue(0, 255, 0, 0) ;
				NIVision.imaqWriteFile(binaryFrame, "/tmp/threshold.jpg", colorTable);
				CameraServer.getInstance().setImage(binaryFrame);


            /** robot code here! **/
            Timer.delay(0.005);		// wait for a motor update time
        }
    }

    public void test() {
    }
}
