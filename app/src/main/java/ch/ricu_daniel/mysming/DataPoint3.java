package ch.ricu_daniel.mysming;


/**
 * DataPoint3 is used to hold a sample triple from a sensor,
 * additionally Timestamp, SensorId and sequence number are hold.
 *
 * @author      Ivo Oesch
 * @version     1.0 03/06/2014
 * @since       1.0
 *
 *  History     28/11/2014 IO corrected missing timestamp in constructors, added UpdateTimestamp
 *              25/01/2015 Change comments.
 */
public class DataPoint3 {

    /**
     * Data set for one data point
     */
    private int x;
    private int y;
    private int z;
    private int RunningNumber;
    private int SensorId;
    private double TimeStamp;

    /**
     * DataPoint3 constructs and initializes a new data point.
     *
     * @param x              The x axis component of the data point.
     * @param y              The y axis component of the data point.
     * @param z              The z axis component of the data point.
     * @param RunningNumber  Sequence number of the data point.
     * @param SensorId       Source of this data point.
     * @param TimeStamp      Timestamp of this sample.
     */
    public DataPoint3(int x, int y, int z, int RunningNumber, int SensorId, double TimeStamp) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.RunningNumber = RunningNumber;
        this.SensorId = SensorId;
        this.TimeStamp = TimeStamp;
    }

    /**
     * Clone returns an exact clone of this object.
     *
     * @return An exact clone of this object.
     */
    @Override
    public DataPoint3 clone() {
        return new DataPoint3(this.x, this.y, this.z, this.RunningNumber, this.SensorId, this.TimeStamp);
    }


    /**
     * SetDataPoint3 sets a data point to a new content.
     *
     * @param x              The x axis component of the data point.
     * @param y              The y axis component of the data point.
     * @param z              The z axis component of the data point.
     * @param RunningNumber  Sequence number of the data point.
     * @param SensorId       Source of this data point.
     * @param TimeStamp      Time when the sample was taken.
     */
    public void SetDataPoint3(int x, int y, int z, int RunningNumber, int SensorId, double TimeStamp) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.RunningNumber = RunningNumber;
        this.SensorId = SensorId;
        this.TimeStamp = TimeStamp;
    }

    /**
     * Assign sets a data point to a new content.
     *
     * @param Source Source of the new content.
     */
    public void Assign(DataPoint3 Source) {

        this.x = Source.x;
        this.y = Source.y;
        this.z = Source.z;
        this.RunningNumber = Source.RunningNumber;
        this.SensorId = Source.SensorId;
        this.TimeStamp = Source.TimeStamp;
    }

    /**
     * SetX sets the x-component of the data point.
     *
     * @param NewX New value for x.
     */
    public void setX(int NewX) {
        x = NewX;
    }

    /**
     * SetY sets the y-component of the data point.
     *
     * @param NewY New value for y.
     */
    public void  setY(int NewY) {
        y = NewY;
    }

    /**
     * SetZ sets the z-component of the data point.
     *
     * @param NewZ New value for z.
     */
    public void setZ(int NewZ) {
        z = NewZ;
    }

    /**
     * UpdateTimeStamp sets the timestamp for a given sample interval.
     *
     * @param SampleInterval Sampleinterval in s to calculate timestamp.
     */
    public void UpdateTimeStamp(double SampleInterval) {
        TimeStamp = SampleInterval * RunningNumber;
    }

    /**
     * Accumulate adds a data point to an existing content
     * (Used to calculate mean values)-
     *
     * @param Source Source of the new content.
     */
    public void Accumulate(DataPoint3 Source) {
        this.x += Source.x;
        this.y += Source.y;
        this.z += Source.z;

    }

    /**
     * GetX returns the x-component of the data point.
     *
     * @return x-component of the data point.
     */
    public int getX() {
        return(x);
    }

    /**
     * GetY returns the y-component of the data point.
     *
     * @return y-component of the data point.
     */
    public int getY() {
        return(y);
    }

    /**
     * GetZ returns the z-component of the data point.
     *
     * @return z-component of the data point.
     */
    public int getZ() {
        return(z);
    }

    /**
     * GetRunningNumber returns the sequence number of the data point.
     *
     * @return sequence number of the data point.
     */
    public int getRunningNumber() {
        return(RunningNumber);
    }

    /**
     * GetSensorId returns the SensorId of the data point.
     *
     * @return SensorId of the data point.
     */
    public int getSensorId() {
        return(SensorId);
    }

    /**
     * GetTimeStamp returns the time stamp (time of sampling) of the data point.
     *
     * @return time stamp (time of sampling) of the data point.
     */
    public double getTimeStamp() {
        return TimeStamp;
    }

}
