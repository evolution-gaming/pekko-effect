package org.apache.pekko.persistence

import org.apache.pekko.persistence.SnapshotProtocol.{DeleteSnapshot, DeleteSnapshots, SaveSnapshot}

object SnapshotProtocolPublic {

  def saveSnapshot(metadata: SnapshotMetadata, snapshot: Any): Any = SaveSnapshot(metadata, snapshot)

  def deleteSnapshot(metadata: SnapshotMetadata): Any = DeleteSnapshot(metadata)

  def deleteSnapshots(persistenceId: String, criteria: SnapshotSelectionCriteria): Any =
    DeleteSnapshots(persistenceId, criteria)
}
