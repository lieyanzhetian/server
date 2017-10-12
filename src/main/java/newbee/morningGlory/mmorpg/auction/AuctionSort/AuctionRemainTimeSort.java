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
package newbee.morningGlory.mmorpg.auction.AuctionSort;

import java.util.Comparator;

import newbee.morningGlory.mmorpg.auction.AuctionItem;

public class AuctionRemainTimeSort implements Comparator<AuctionItem> {

	
	@Override
	public int compare(AuctionItem o1, AuctionItem o2) {
		int remainTime1 = o1.getRemainTime();
		int remainTime2 = o2.getRemainTime();
		return remainTime1 - remainTime2;
	}

	

}
