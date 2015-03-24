package br.ufmg.dcc.labsoft.refactoringanalyzer;

import org.junit.Test;

public class TestWithRealInstancesMoveOperation {

	@Test
	public void test() throws Exception {
		TestBuilder test = new TestBuilder();
		
		test.project("https://github.com/nathanmarz/storm.git", "moved-to-apache").atCommit("cdb116e942666973bc4eaa0df098d5bab82739e7").notContains("Move Operation public set_result_isSet(value boolean) : void from class backtype.storm.generated.DistributedRPCInvocations to public set_functionName_isSet(value boolean) : void from class backtype.storm.generated.DistributedRPC.execute_args");
		test.project("https://github.com/k9mail/k-9.git", "master").atCommit("34cfd8e5b422fa8c5b30fc0c526fb747e519feb0").notContains("Move Operation public move(from File, to File) : boolean from class com.fsck.k9.helper.Utility to public isQuietTime() : boolean from class com.fsck.k9.K9");
		test.project("https://github.com/thinkaurelius/titan.git", "titan05").atCommit("46a4fd6c01767819d7d8748de287e931cc523fa0").notContains("Move Operation public testCacheConcurrency() : void from class com.thinkaurelius.titan.graphdb.TitanEventualGraphTest to public testInternalAndExternalIndexing() : void from class com.thinkaurelius.titan.graphdb.TitanIndexTest");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("d06fcec37fb3f3d45ffbd3fe15eafce77ba64069").notContains("Move Operation public setSwapStoresAndCleanState(builderForValue Builder) : Builder from class voldemort.client.protocol.pb.VoldemortAdminRequest.Builder to public clearRebalancePartitionInfo() : Builder from class voldemort.client.protocol.pb.InitiateRebalanceNodeRequest.Builder");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("a7c9b91f1f02d3b4a82b53edb82dfa086743962a").notContains("Move Operation public addAllPartitions(values Iterable<? extends java.lang.Integer>) : Builder from class voldemort.client.protocol.pb.DeletePartitionEntriesRequest.Builder to public setReplicaToPartition(index int, value PartitionTuple) : Builder from class voldemort.client.protocol.pb.FetchPartitionEntriesRequest.Builder");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("c228e5f7f819bd74ceec8070ad0ededbe4220167").contains("Move Operation package makePlan(cCluster Cluster, cStores List<StoreDefinition>, fCluster Cluster, fStores List<StoreDefinition>) : RebalancePlan from class voldemort.client.rebalance.RebalancePlanTest to public makePlan(cCluster Cluster, cStores List<StoreDefinition>, fCluster Cluster, fStores List<StoreDefinition>) : RebalancePlan from class voldemort.ClusterTestUtils");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("9785e684d183fbebe99c35e517a3e60333b5f5b6").notContains("Move Operation public isPartitionAware() : boolean from class voldemort.store.noop.NoopStorageEngine to public delete(request VoldemortRequestWrapper<ByteArray,byte[]) : boolean from class voldemort.store.routed.PipelineRoutedStore");
		test.project("https://github.com/k9mail/k-9.git", "master").atCommit("8a226972a545ef95f9edbe898e5f6423b4b1873f").notContains("Move Operation public getTimeFormat() : DateFormat from class com.fsck.k9.activity.K9Activity to public getThemeBackgroundColor() : int from class com.fsck.k9.activity.K9ListActivity");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("0cc38b8ce750c9940eefe9b3274c4fb2f9e5437e").contains("Move Operation public getAddedInTarget(current Set<T>, target Set<T>) : Set<T> from class voldemort.utils.RebalanceUtils to public getAddedInTarget(current Set<T>, target Set<T>) : Set<T> from class voldemort.utils.Utils");
		test.project("https://github.com/netty/netty.git", "master").atCommit("754392aaa92b5edd72d941873a1fadbd1029f279").notContains("Move Operation public order() : ByteOrder from class io.netty.buffer.NioBufferBackedByteBuf to public factory() : ByteBufFactory from class io.netty.buffer.HeapByteBuf");
		
		test.project("https://github.com/netty/netty.git", "master").atCommit("ce87b627be941e3dc56e85164088ab68f80188db").notContains("Move Operation public newSucceededFuture() : Future from class io.netty.util.concurrent.AbstractEventExecutor to public getNow() : V from class io.netty.util.concurrent.SucceededFuture");
		test.project("https://github.com/netty/netty.git", "master").atCommit("607d784e5eb6dd73abccb3a4f42e8cc7cd7dd4bc").notContains("Move Operation protected setOpWrite(channel AbstractNioChannel) : void from class io.netty.channel.socket.nio.SelectorEventLoop to protected doFlush(future ChannelFuture) : int from class io.netty.channel.socket.nio.NioSocketChannel");
		test.project("https://github.com/clojure/clojure.git", "master").atCommit("279dd21d4b919496c8fb54c3135f2b82cc36f5c2").notContains("Move Operation public withMeta(meta IPersistentMap) : Obj from class clojure.lang.PersistentHashtableMap to public cons(o Object) : IPersistentCollection from class clojure.lang.AnArray");
		test.project("https://github.com/nathanmarz/storm.git", "moved-to-apache").atCommit("cdb116e942666973bc4eaa0df098d5bab82739e7").notContains("Move Operation public findByThriftId(fieldId int) : _Fields from class backtype.storm.generated.DRPCExecutionException to public getFieldValue(field _Fields) : Object from class backtype.storm.generated.DistributedRPCInvocations.result_args");
		test.project("https://github.com/netty/netty.git", "master").atCommit("9410fd155e4612149f3e8b50bd77ca73f8325503").notContains("Move Operation protected getSucceededFuture() : ChannelFuture from class org.jboss.netty.channel.socket.nio.NioServerSocketChannel to protected setClosed() : boolean from class org.jboss.netty.channel.local.LocalServerChannel");
		test.project("https://github.com/thinkaurelius/titan.git", "titan05").atCommit("6e3eaf56db44422348049f75117cb4b07aebfd9f").notContains("Move Operation public makePropertyKey(name String) : PropertyKeyMaker from class com.thinkaurelius.titan.core.TitanTransaction to public makePropertyKey(name String) : PropertyKeyMaker from class com.thinkaurelius.titan.graphdb.blueprints.TitanBlueprintsGraph");
		test.project("https://github.com/netty/netty.git", "master").atCommit("65c2a6ed46c163081fed5307f33489a606177f33").notContains("Move Operation package writeMedium(value int) : CompositeByteBuf from class io.netty.buffer.CompositeByteBuf to public writeMedium(value int) : CompositeByteBuf from class io.netty.buffer.CompositeByteBuf");
		test.project("https://github.com/clojure/clojure.git", "master").atCommit("7de158ba6ee7cbf73e9f91fce4d038dd73b40789").notContains("Move Operation public peek() : Object from class clojure.lang.AMapEntry to public get(key Object) : Object from class clojure.lang.APersistentMap");
		test.project("https://github.com/k9mail/k-9.git", "master").atCommit("41d7ca51a3de28451fa6d2b39ed310a67b8925f0").notContains("Move Operation public expunge() : Message[] from class com.fsck.k9.mail.store.Pop3Store.Pop3Folder to public isExpungeCapable() : boolean from class com.fsck.k9.mail.store.ImapStore");
		test.project("https://github.com/voldemort/voldemort.git", "master").atCommit("d06fcec37fb3f3d45ffbd3fe15eafce77ba64069").notContains("Move Operation public getStealReplicaPartitionsList() : List<java.lang.Integer> from class voldemort.client.protocol.pb.InitiateRebalanceNodeRequest to public getPartitions() : List<Integer> from class voldemort.client.rebalance.RebalancePartitionsInfo");
		
		test.assertExpectations();
	}

}