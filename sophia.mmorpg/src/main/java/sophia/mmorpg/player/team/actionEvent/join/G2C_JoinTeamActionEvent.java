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
package sophia.mmorpg.player.team.actionEvent.join;

import org.apache.mina.core.buffer.IoBuffer;

import sophia.foundation.communication.core.ActionEventBase;

/**
 * （邀请）加入队伍
 */
public final class G2C_JoinTeamActionEvent extends ActionEventBase {
	private byte playerActionType;// 1：对方在30秒内没有响应/2：拒绝加入/3：通过加入

	public void setPlayerActionType(byte playerActionType) {
		this.playerActionType = playerActionType;
	}

	@Override
	protected IoBuffer packBody(IoBuffer buffer) {
		buffer.put(playerActionType);
		return buffer;
	}

	@Override
	public void unpackBody(IoBuffer buffer) {

	}
}
