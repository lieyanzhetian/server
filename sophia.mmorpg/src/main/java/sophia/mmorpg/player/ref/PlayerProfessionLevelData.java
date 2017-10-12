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
package sophia.mmorpg.player.ref;

import sophia.foundation.property.PropertyDictionary;

/**
 * 玩家-职业-等级属性
 */
public final class PlayerProfessionLevelData {
	private String playerProfessionId;

	private int level;

	private PropertyDictionary property;

	public PlayerProfessionLevelData() {

	}

	public PlayerProfessionLevelData(String playerProfessionId, int level,
			PropertyDictionary property) {
		super();
		this.playerProfessionId = playerProfessionId;
		this.level = level;
		this.property = property;
	}

	public String getPlayerProfessionId() {
		return playerProfessionId;
	}

	public void setPlayerProfessionId(String playerProfessionId) {
		this.playerProfessionId = playerProfessionId;
	}

	public final int getLevel() {
		return level;
	}

	public final void setLevel(int level) {
		this.level = level;
	}

	public final PropertyDictionary getLevelProperties() {
		return property;
	}

	public final void setLevelProperties(PropertyDictionary property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "PlayerProfessionLevelData [playerProfessionId=" + playerProfessionId + ", level=" + level + ", property=" + property + "]";
	}
}
