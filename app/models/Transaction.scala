package models

case class Transaction(id: String,
                       fee: Long,
                       blockId: String,
                       isCoinbase: Boolean,
                       timestamp: Long,
                       defaultProofOpt: Option[String])

case class FullFilledTransaction(transaction: Transaction, inputs: List[Input], output: List[Output], contract: List[Contract])