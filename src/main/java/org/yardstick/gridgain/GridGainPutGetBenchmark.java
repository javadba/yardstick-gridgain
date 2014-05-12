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

package org.yardstick.gridgain;

/**
 * GridGain benchmark that performs put and get operations.
 */
public class GridGainPutGetBenchmark extends GridGainAbstractBenchmark {
    /** */
    public GridGainPutGetBenchmark() {
        // Use cache "atomic" for this benchmark. Configuration for the cache can be found
        // in 'config/gridgain-benchmark-config.xml' file.
        super("atomic");
    }

    /** {@inheritDoc} */
    @Override public void test() throws Exception {
        int key = nextRandom(args.range());

        Object val = cache.get(key);

        if (val != null)
            key = nextRandom(args.range());

        cache.putx(key, new GridGainBenchmarkValue(key));
    }
}