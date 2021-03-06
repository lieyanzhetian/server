/**
 *   Copyright 2013-2015 Sophia
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
*/
package sophia.game.plugIns.gateWay;

import sophia.game.core.PlugIn;

public class GateWayPlugIn implements PlugIn<GateWay> {

	private GateWay gateWay;
	
	@Override
	public GateWay getModule() {
		return gateWay;
	}

	@Override
	public void initialize() {
		gateWay = new GateWay();
	}

	@Override
	public void start() {
		gateWay.ready();
		gateWay.startUp();
	}

	@Override
	public void stop() {
		gateWay.shutDown();
	}

	@Override
	public void cleanUp() {
		gateWay.destroy();
	}

}
