/*
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package org.yardstickframework.gridgain.cache;

import org.gridgain.grid.cache.*;

import java.util.*;

/**
 * GridGain benchmark that performs transactional put and get operations
 * with {@link GridCacheMemoryMode#OFFHEAP_TIERED OFFHEAP TIERED} memory mode.
 */
public class GridGainPutGetTxOffHeapBenchmark extends GridGainPutGetTxBenchmark {
    /** {@inheritDoc} */
    @Override protected GridCache<Integer, Object> cache() {
        return grid().cache("tx-offheap");
    }
}
