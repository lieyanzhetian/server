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
package sophia.mmorpg.stat.logs;

import sophia.mmorpg.stat.StatLogType;
import sophia.mmorpg.utils.RecyclePool;

public class StatLevel extends AbstractStatLog{
	
	public static RecyclePool<StatLevel> Pool = new RecyclePool<StatLevel>() {

		@Override
		protected StatLevel instance() {
			return new StatLevel();
		}

		@Override
		protected void onRecycle(StatLevel obj) {
			obj.clear();
		}
	};
	
	@Override
	public void recycle() {
		Pool.recycle(this);
	}
	@Override
	public byte getStatLogType() {
		return StatLogType.level;
	}
	
	
	public void setLevel(int level){
		data.n1 = level;
	}
	
	public void setExp(long exp){
		data.n2 = exp;
	}
	

}
