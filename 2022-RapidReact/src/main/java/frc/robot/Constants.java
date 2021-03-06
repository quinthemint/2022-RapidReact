// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DrivetrainConstants {
        public static final int kLeftMotorID1 = 0;
        public static final int kLeftMotorID2 = 1;
        public static final int kRightMotorID1 = 2;
        public static final int kRightMotorID2 = 3;
        //public static final int kLeftEncoder = ;
        //public static final int kRightEncoder = ;

        public static final double kEncoderTick2Feet = 1.0 / 42 * 6 * Math.PI / 12;

    }
    
    public static final class ArmConstants{
        // public static final int kArmMotorID1 = ;
        // public static final int kArmMotorID2 = ;

        //public static final double kEncoderTick2Deg = ;
    }

    public static final class IntakeConstants{
        // public static final int kIntakeMotorID1 = ;
        // public static final int kIntakeMotorID2 = ;
    }

    public static final class OIConstants {
        public static final int kDriverJoystickPort = 0;
        public static final int kArcadeDriveSpeedAxis = 1;
        public static final int kArcadeDriveTurnAxis = 4;
    }
}
