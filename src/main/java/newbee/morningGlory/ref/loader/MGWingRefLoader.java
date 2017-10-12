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
package newbee.morningGlory.ref.loader;

import newbee.morningGlory.mmorpg.player.wing.MGPlayerWingRef;
import newbee.morningGlory.ref.RefKey;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class MGWingRefLoader extends AbstractGameRefObjectLoader<MGPlayerWingRef> {

	public MGWingRefLoader() {
		super(RefKey.wing);
	}

	@Override
	protected MGPlayerWingRef create() {
		return new MGPlayerWingRef();
	}

	@Override
	protected void fillNonPropertyDictionary(MGPlayerWingRef ref, JsonObject refData) {
//		if (!refData.get("wingUpgradeData").toString().equals("null")) {
//			JsonArray itemRefId = refData.get("wingUpgradeData").getAsJsonArray();
//			Map<String, Integer> updataNeed = new LinkedHashMap<>();
//			for (JsonElement entry : itemRefId) {
//				JsonObject elem = entry.getAsJsonObject();
//				String itemId = elem.get("refId").getAsString();
//				int itemNum = elem.get("number").getAsInt();
//				updataNeed.put(itemId, itemNum);
//			}
//			ref.setUpdataNeed(updataNeed);
//		}
		if (refData.has("effectData") && refData.get("effectData") != null) {
			JsonElement effectJson = refData.getAsJsonObject().get("effectData");
			if (!effectJson.isJsonNull()) {
				fillPropertyDictionary(ref.getEffectProperty(), effectJson.getAsJsonObject());
			}
		}

		super.fillNonPropertyDictionary(ref, refData);
	}

}
