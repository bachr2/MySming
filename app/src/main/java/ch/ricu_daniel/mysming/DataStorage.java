package ch.ricu_daniel.mysming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Class to store the data values of a sensor measurement.
 *
 * @author Daniel Meer
 * @version 1.0, 22.12.2014
 */
public class DataStorage {

    // List with the data points.
    private List<DataPoint3> mStorageList;

    /**
     * Constructor to create a new data storage.
     */
    public DataStorage() {
        mStorageList = new ArrayList<>();
    }

    /**
     * Adds one data point to the storage.
     *
     * @param point The new point to add.
     */
    public synchronized void addPoint(DataPoint3 point) {
        mStorageList.add(point);
    }

    /**
     * Adds multiple data points to the storage.
     *
     * @param points The new points to add.
     */
    public synchronized void addAllPoints(Collection<DataPoint3> points) {
        mStorageList.addAll(points);
    }

    /**
     * Gets an array with the new data points.
     *
     * @param currentPosition Position or sequence number of the first new data point. Use a
     *                        variable to keep track of it.
     * @return Array with the new data points.
     */
    public synchronized DataPoint3[] getNewData(int currentPosition) {
        List<DataPoint3> subList = mStorageList.subList(currentPosition, mStorageList.size()-1);
        DataPoint3[] outputList = new DataPoint3[subList.size()];
        return subList.toArray(outputList);
    }

    /**
     * Get size of the data storage.
     *
     * @return Number of data points in the data storage.
     */
    public synchronized int getSize() {
        return mStorageList.size();
    }
}
