package jp.jaxa.iss.kibo.rpc.defaultapk;

import gov.nasa.arc.astrobee.Result;
import gov.nasa.arc.astrobee.types.Point;
import gov.nasa.arc.astrobee.types.Quaternion;
import jp.jaxa.iss.kibo.rpc.api.KiboRpcService;

/**
 * Class meant to handle commands from the Ground Data System and execute them in Astrobee
 */

public class YourService extends KiboRpcService {
    @Override
    protected void runPlan1(){
        // write here your plan 1
        api. startMission();

        // astrobee is undocked and the mission starts
        Point moveToPointA = new Point(11.21, -9.8, 4.79);
        Quaternion quatA = new Quaternion(0,0,(float)-7.07,(float)7.07);
        api.moveTo(moveToPointA,quatA,false);



        // take snapshots
        api.takeSnapshot();


        /* Send mission completion */
        api.reportMissionCompletion();

    }

    @Override
    protected void runPlan2(){
        // write here your plan 2
    }

    @Override
    protected void runPlan3(){
        // write here your plan 3
    }



}

