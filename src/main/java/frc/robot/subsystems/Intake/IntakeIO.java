package frc.robot.subsystems.Intake;


import static edu.wpi.first.units.Units.Rotations;
import static edu.wpi.first.units.Units.RotationsPerSecond;

import org.littletonrobotics.junction.AutoLog;
import frc.robot.subsystems.MotorOutputMode;

import edu.wpi.first.units.measure.Angle;
import edu.wpi.first.units.measure.AngularVelocity;
import edu.wpi.first.units.measure.Voltage;

public interface IntakeIO extends AutoCloseable {
  @AutoLog
  public class IntakeIOInputs {
    public boolean connected = false;
    public Angle position = Rotations.zero();
    public AngularVelocity velocity = RotationsPerSecond.zero();
    public boolean[] motorsConnected = new boolean[] {};
    public double[] appliedVolts = new double[] {};
    public double[] supplyCurrentAmps = new double[] {};
    public double[] statorCurrentAmps = new double[] {};
    public double[] temperatureCelsius = new double[] {};

    public MotorOutputMode outputMode = MotorOutputMode.NEUTRAL;
  }

  public default void updateInputs(IntakeIOInputs inputs) {}

  public default void setVoltageOut(Voltage output) {}

  public default void stop() {}

  @Override public default void close() {}
}
