package com.imc.driver.wait.dao.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.LockModeType;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.imc.driver.wait.dao.MoveDAO;
import com.imc.driver.wait.service.entities.Move;
import com.imc.driver.wait.service.entities.Order;

@Stateless(name="MoveDAO")
@Remote(MoveDAO.class)
public class MoveDAOImpl implements MoveDAO {

	private static final Logger log = LoggerFactory.getLogger(MoveDAOImpl.class);

	@PersistenceContext(unitName = "SWS")
	private EntityManager em;

	@Override
	public void update(Move move) {
		log.debug("updating move with id: " + move.getId());
		try {
			// get lock on order
			em.lock(move.getOrder(), LockModeType.PESSIMISTIC_WRITE); // FOR UPDATE
//			em.lock(move.getOrder(), LockModeType.PESSIMISTIC_FORCE_INCREMENT); // FOR UPDATE NOWAIT
			em.merge(move);
		} catch (RuntimeException re) {
			log.error("update failed", re);
			throw re;
		}
	}

	@Override
	public Move get(int moveNo, int cmpyNo) {
		log.info("getting Move with moveNo: " + moveNo + " and cmpyNo = " + cmpyNo);
		try {
			Move move = (Move) em.createQuery("FROM Move "
					+ "WHERE no = :moveNo "
					+ "AND cmpyNo = :cmpyNo")
					.setParameter("moveNo", moveNo)
					.setParameter("cmpyNo", cmpyNo)
					.getSingleResult();
			
			log.info("get successful");
			
			return move;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}

//private static final int bit_flag_31 = (int) Math.pow(2, 30);
//@Override
//public void updateOriginArvDpt(int cmpyNo, int moveNo, Date arrival, Date departure) {
//	try {
//		Move move = getMoveByMoveNoAndCmpyNo(moveNo, cmpyNo);
//		
//		// Lock down the order
//		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_WRITE); // FOR UPDATE
////		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_FORCE_INCREMENT); // FOR UPDATE NOWAIT
//		
//		
//		// arrival at origin
//		move.setOarvdate(arrival);
//		move.setOarvtime(arrival);
//		
//		// departure from origin
//		move.setOdptdate(departure);
//		move.setOdpttime(departure);
//		
//		//might also need to set odate/time
//		
//		// The left most bit in the bitmask is reserved for "timestamp confirmed".
//		// Set it to true for both arv and dpt
//		move.setOdptflag(move.getOdptflag() | bit_flag_31);
//		move.setOarvflag(move.getOarvflag() | bit_flag_31);
//		
//	} catch (RuntimeException re) {
//		log.error("confirmArvDpt failed", re);
//		throw re;
//	}
//}
//
//@Override
//public void updateDestinationArvDpt(int cmpyNo, int moveNo, Date arrival, Date departure) {
//	try {
//		Move move = getMoveByMoveNoAndCmpyNo(moveNo, cmpyNo);
//		
//		// Lock down the order
//		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_WRITE); // FOR UPDATE
////		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_FORCE_INCREMENT); // FOR UPDATE NOWAIT
//		
//		// arrival at destination
//		move.setDarvdate(arrival);
//		move.setDarvtime(arrival);
//		
//		// departure from destination
//		move.setDdptdate(departure);
//		move.setDdpttime(departure);
//		
//		//might also need to set ddate/time
//		
//		// The left most bit in the bitmask is reserved for "timestamp confirmed".
//		// Set it to true for both arv and dpt
//		move.setDarvflag(move.getDarvflag() | bit_flag_31);
//		move.setDdptflag(move.getDdptflag() | bit_flag_31);
//		
//	} catch (RuntimeException re) {
//		log.error("confirmArvDpt failed", re);
//		throw re;
//	}
//}
//
//private Move getMoveByMoveNoAndCmpyNo(int moveNo, int cmpyNo) {
//	Query query = em.createQuery("Select m from Move m where m.no = :moveNo AND m.cmpyNo = :cmpyNo");
//	query.setParameter("moveNo", moveNo);
//	query.setParameter("cmpyNo", cmpyNo);
//	Move move = (Move)query.getSingleResult();
//	return move;
//}



//@Override
//public List<MoveDTO> getMoveDTOsByDispatcher(int cmpyNo, String dispatcher) {
//	Query query = em.createQuery("SELECT m.no AS moveNo, m.order.no AS orNo, "
//			+ "m.order.divCode, "
//			+ "m.order.pro, "
//			+ "m.drCode,"
//			+ "m.dlpCode, "
//			+ "m.darvdate, "
//			+ "m.darvtime, "
//			+ "m.olpCode, "
//			+ "m.odptdate, "
//			+ "m.odpttime, "
//			+ "d.usrCode  "
//			+ "m.order.cmpyNo "
//            + "FROM Move m, Driver d, Locprof l_o, Locprof l_d "
////            + "LEFT JOIN Order o ON m.orNo = o.no "
////            + "LEFT JOIN Driver d WITH m.drCode = d.code "
////            + "LEFT JOIN Locprof l_o WITH m.dlpCode = l.code AND m.cmpyNo = l.cmpyNo "
////            + "LEFT JOIN Locprof l_d WITH m.dlpCode = l.code AND m.cmpyNo = l.cmpyNo "
//            + "WHERE m.drCode = d.code "
//            + "AND m.dlpCode = l_o.code AND m.cmpyNo = l_o.cmpyNo "
//            + "AND m.dlpCode = l_d.code AND m.cmpyNo = l_d.cmpyNo "
//            
//            + "AND m.order.cmpyNo = :cmpyNo "
//            + "AND d.usrCode = :usrCode "
//            + "AND m.drCode <> '999' "
//            + "AND m.order.pdate IS NULL "
//            + "AND m.darvdate IS NOT NULL "
//            + "AND m.darvtime IS NOT NULL "
////            + "AND m.darvdate > (CURRENT_DATE - INTERVAL '30 days') "
//            + "AND ((l_o.nrp = 'Y' AND l_o.code NOT LIKE 'IMCD%') OR (l_d.nrp = 'Y' AND l_d.code NOT LIKE 'IMCD%')) "
//            + "ORDER BY m.drCode,m.order.pro, m.darvdate, m.darvtime");
//	query.setParameter("usrCode", dispatcher);
//	query.setParameter("cmpyNo", cmpyNo);
//	List<Object[]> resultList = (List<Object[]>) query.getResultList();
//	List<MoveDTO> unconfirmedDriverWaits = new ArrayList<MoveDTO>();
//	for(Object[] r : resultList) {
//		MoveDTO dw = new MoveDTO((int)r[0],(int)r[1],(String)r[2],(String)r[3],(String)r[4],(String)r[5],combineDateAndTime((Date)r[6], (Date)r[7]),(String)r[8],combineDateAndTime((Date)r[9],(Date)r[10]),(String)r[11],(int)r[12]);
//		unconfirmedDriverWaits.add(dw);
//	}
//	return unconfirmedDriverWaits;
//	
////	Query query = em.createNativeQuery("SELECT m.no AS moveNo,o.div_code,o.pro,m.dr_code,m.dlp_code, m.darvdate, m.darvtime, m.olp_code, m.odptdate, m.odpttime, d.usr_code  "
////                            + "FROM trk.move m "
////                            + "LEFT OUTER JOIN trk.order o ON m.or_no = o.no "
////                            + "LEFT OUTER JOIN trk.driver d ON m.dr_code = d.code "
////                            + "LEFT OUTER JOIN trk.locprof l_o ON m.dlp_code = l.code AND m.cmpy_no = l.cmpy_no "
////                            + "LEFT OUTER JOIN trk.locprof l_d ON m.dlp_code = l.code AND m.cmpy_no = l.cmpy_no "
////                            + "WHERE o.cmpy_no = :cmpyNo "
////                            + "AND d.usr_code = :usrCode "
////                            + "AND m.dr_code <> '999' "
////                            + "AND o.pdate IS NULL "
////                            + "AND m.darvdate IS NOT NULL "
////                            + "AND m.darvtime IS NOT NULL "
////                            + "AND m.darvdate > (CURRENT_DATE - INTERVAL '30 days') "
////                            + "AND ((l_o.nrp = 'Y' AND l_o.code NOT LIKE 'IMCD%') OR (l_d.nrp = 'Y' AND l_d.code NOT LIKE 'IMCD%')) "
////                            + "ORDER BY m.drCode,o.pro, m.darvdate, m.darvtime;");
//
//}
//private Date combineDateAndTime(Date date, Date time) {
//	Calendar calDate = Calendar.getInstance();
//	calDate.setTime(date);
//	
//	Calendar calTime = Calendar.getInstance();
//	calTime.setTime(time);
//	
//	Calendar calCombined = Calendar.getInstance();
//	calCombined.set(
//			calDate.get(Calendar.YEAR), calDate.get(Calendar.MONTH), calDate.get(Calendar.DAY_OF_MONTH), 
//            calTime.get(Calendar.HOUR_OF_DAY), calTime.get(Calendar.MINUTE), calTime.get(Calendar.SECOND)
//            );
//	
//	return calCombined.getTime();
//}




//@Override
//public void confirmArvDpt(Drwait driverWait) {
//	try {
////		em.find(Order.class, driverWait.getOrNo(),LockModeType.OPTIMISTIC);
//		Move move = getMoveByMoveNoAndCmpyNo(driverWait.getMoveNo(),driverWait.getCmpyNo());
//		
//		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_WRITE); // FOR UPDATE
////		em.lock(move.getOrder(), LockModeType.PESSIMISTIC_FORCE_INCREMENT); // FOR UPDATE NOWAIT
//		
//		if (driverWait.getOrigOrDest().equalsIgnoreCase("O")) {
//			// if orig_or_dest == "O", the driver wait is at the ORIGIN of a move
//			move.setOarvdate(driverWait.getArrival()); // (oarvdate)
//			move.setOarvtime(driverWait.getArrival()); // (oarvtime)
//			
//			// set origin arrival "Timestamp Confirmed" bit flag (left-most-bit) to true
//			move.setOarvflag(move.getOarvflag() | bit_flag_31); // (oarvflag)
//			
//			move.setOdptdate(driverWait.getDeparture()); // (odptdate)
//			move.setOdpttime(driverWait.getDeparture()); // (odpttime)
//			
//			// set origin departure "Timestamp Confirmed" bit flag (left-most-bit) to true
//			move.setOdptflag(move.getOdptflag() | bit_flag_31); // (odptflag)
//			
//			//might also need to set odate/time
//			
//		} else if (driverWait.getOrigOrDest().equalsIgnoreCase("D")) {
//			// if orig_or_dest == "D", the driver wait is at the DESTINATION of a move
//			move.setDarvdate(driverWait.getArrival()); // (darvdate)
//			move.setDarvtime(driverWait.getArrival()); // (darvtime)
//			
//			// set dest arrival "Timestamp Confirmed" bit flag (left-most-bit, #31) to true
//			move.setDarvflag(move.getDarvflag() | bit_flag_31); // (darvflag)
//			
//			move.setDdptdate(driverWait.getDeparture()); // (ddptdate)
//			move.setDdpttime(driverWait.getDeparture()); // (ddpttime)
//			
//			// set dest departure "Timestamp Confirmed" bit flag (left-most-bit, #31) to true
//			move.setDdptflag(move.getDdptflag() | bit_flag_31); // (ddptflag)
//			
//			//might also need to set ddate/time
//		}
////		em.flush();
////		System.out.println();
//		
//	} catch (RuntimeException re) {
//		log.error("confirmArvDpt failed", re);
//		throw re;
//	}
//}

//Query queryForCurrentBitFlags = em.createQuery("SELECT oarvflag, odptflag, darvflag, ddptflag "
//		+ "FROM Move WHERE no = :moveNo AND cmpy_no = :cmpyNo");
//
//queryForCurrentBitFlags.setParameter("moveNo", driverWait.getMoveNo());
//queryForCurrentBitFlags.setParameter("cmpyNo", driverWait.getCmpyNo());
//
//queryForCurrentBitFlags.

//String columnPrefixLetter = driverWait.getOrigOrDest().toLowerCase();
//Query query = em.createNativeQuery("UPDATE trk.move "
//		+ "SET " + columnPrefixLetter + "arvdate = :arvdate, "
//				+ columnPrefixLetter + "arvtime = :arvtime, "
//				+ columnPrefixLetter + "arvflag = :arvflag, "
//				+ columnPrefixLetter + "dptdate = :dptdate, "
//				+ columnPrefixLetter + "dpttime = :dpttime, "
//				+ columnPrefixLetter + "dptflag = :dptflag " 
//		+ "WHERE no = :moveNo AND cmpy_no = :cmpyNo");
//
//query.setParameter("moveNo", driverWait.getMoveNo());
//query.setParameter("cmpyNo", driverWait.getCmpyNo());
//
////updateMoveQuery.setParameter("arvdateColumn",  + "arvdate");
//query.setParameter("arvdate", driverWait.getArrival());
//
////updateMoveQuery.setParameter("arvtimeColumn", columnPrefixLetter + "arvtime");
//query.setParameter("arvtime", driverWait.getArrival());
//
////query.setParameter("arvflag", );
//
////updateMoveQuery.setParameter("dptdateColumn", columnPrefixLetter + "dptdate");
//query.setParameter("dptdate", driverWait.getDeparture());
//
////updateMoveQuery.setParameter("dpttimeColumn", columnPrefixLetter + "dpttime");
//query.setParameter("dpttime", driverWait.getDeparture());
//query.setParameter("arvflag", "("+columnPrefixLetter + "arvflag::bit(31) | b'1000000000000000000000000000000')::int");
//query.setParameter("dptflag", "("+columnPrefixLetter + "dptflag::bit(31) | b'1000000000000000000000000000000')::int");
////updateMoveQuery.setParameter("dptflagColumn", columnPrefixLetter + "dptflag");
//
//query.executeUpdate();


//private Order getOrderWithLockByOrderNo(int orderNo) {
//	Order order = em.find(Order.class, orderNo,LockModeType.PESSIMISTIC_WRITE);
//	return order;
//}


//@Override
//public void updateDarvAndDdpt(Date darvdate, Date darvtime, Date ddptdate,
//		Date ddpttime) {
//	log.debug("merging Move instance");
//	try {
//		Order order = entityManager.find(Order.class, orderNo, LockModeType.PESSIMISTIC_WRITE);
//		Move result = entityManager.merge(detachedInstance);
//		log.debug("merge successful");
//		return result;
//	} catch (RuntimeException re) {
//		log.error("merge failed", re);
//		throw re;
//	}
//}
//
//@Override
//public void updateDarvAndDdpt(Date darvDateTime, Date ddptDateTime) {
//	log.debug("merging Move instance");
//	try {
//		Move result = entityManager.merge(detachedInstance);
//		log.debug("merge successful");
//		return result;
//	} catch (RuntimeException re) {
//		log.error("merge failed", re);
//		throw re;
//	}
//}


//package com.imc.driver.wait.service.entities;
//
////Generated May 7, 2015 12:19:02 PM by Hibernate Tools 3.4.0.CR1
//
//import javax.ejb.Stateless;
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//
///**
//* Home object for domain model class Move.
//* @see com.imc.driver.wait.service.entities.Move
//* @author Hibernate Tools
//*/
//@Stateless
//public class MoveHome {
//
//	private static final Log log = LogFactory.getLog(MoveHome.class);
//
//	@PersistenceContext
//	private EntityManager entityManager;
//
//	public void persist(Move transientInstance) {
//		log.debug("persisting Move instance");
//		try {
//			entityManager.persist(transientInstance);
//			log.debug("persist successful");
//		} catch (RuntimeException re) {
//			log.error("persist failed", re);
//			throw re;
//		}
//	}
//
//	public void remove(Move persistentInstance) {
//		log.debug("removing Move instance");
//		try {
//			entityManager.remove(persistentInstance);
//			log.debug("remove successful");
//		} catch (RuntimeException re) {
//			log.error("remove failed", re);
//			throw re;
//		}
//	}
//
//	public Move merge(Move detachedInstance) {
//		log.debug("merging Move instance");
//		try {
//			Move result = entityManager.merge(detachedInstance);
//			log.debug("merge successful");
//			return result;
//		} catch (RuntimeException re) {
//			log.error("merge failed", re);
//			throw re;
//		}
//	}
//
//	public Move findById(long id) {
//		log.debug("getting Move instance with id: " + id);
//		try {
//			Move instance = entityManager.find(Move.class, id);
//			log.debug("get successful");
//			return instance;
//		} catch (RuntimeException re) {
//			log.error("get failed", re);
//			throw re;
//		}
//	}
//}
