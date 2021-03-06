package team108;

import java.util.Random;

import team108.Path.BreadthFirstPathing;
import team108.Path.DepthFirstPathing;
import team108.Path.____DirectWithOptimizedBuggingPathGenerator____OLD;
import team108.Path.DirectWithOptimizedBuggingPathGenerator;
import team108.Path.Path;
import team108.Path.PathGenerator;
import team108.Strategies.*;
import battlecode.common.Clock;
import battlecode.common.GameActionException;
import battlecode.common.MapLocation;
import battlecode.common.RobotController;

/**
 * The Modular 
 * @author Stephen Bush
 */
public class RobotPlayer {
	
	static I_RobotStrategy strategy;
	
	public static void run(RobotController rc) throws GameActionException {
		
		//strategy = new SwarmAndScoopStrategy(rc);
		strategy = new HardFormationSwarmStrategy(rc);
		
		
		while (true) {
			strategy.run();
			rc.yield();
		}
	}
}
