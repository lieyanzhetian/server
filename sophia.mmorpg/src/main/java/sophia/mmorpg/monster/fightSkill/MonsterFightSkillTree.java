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
package sophia.mmorpg.monster.fightSkill;

import java.util.HashMap;
import java.util.Map;

import sophia.mmorpg.base.sprite.fightSkill.FightSkill;

public class MonsterFightSkillTree {
	
	private static Map<String, FightSkill> fightSkills = new HashMap<>();

	public static Map<String, FightSkill> getFightSkills() {
		return fightSkills;
	}

	public static void setFightSkills(Map<String, FightSkill> fightSkills) {
		MonsterFightSkillTree.fightSkills = fightSkills;
	}
	
	public static FightSkill getFightSkill(String skillRefId) {
		return fightSkills.get(skillRefId);
	}
	
	public static void addFightSkill(FightSkill fightSkill) {
		fightSkills.put(fightSkill.getRefId(), fightSkill);
	}
}
