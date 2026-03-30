import { MainLayout } from '../../layouts/MainLayout/MainLayout';
import './AccountPage.css';

export function AccountPage() {
    return (
        <MainLayout>
            <div className='account-layout'>
            <div className='side-bar'>
                <h2 className='side-bar-title'>Accounts</h2>
            </div>
            <div className='account-info'>
                <p className='account-title'>Checking</p>
                <p className='account-value'>123456789</p>
                <p className='account-title'>Balance:</p>
                <p className='account-value'>$1000.00</p>
                <p className='account-title'>Currency:</p>
                <p className='account-value'>USD</p>
            </div>
            <div className='account-actions'>
                <h1 className='transaction-history-title'>Transaction History</h1>
                <div className='transaction-history'>
                    <table>
                        <tr>
                            <th>Date</th>
                            <th>Description</th>
                            <th>Amount</th>
                            <th>Balance</th>
                        </tr>
                        <tr>
                            <td>2024-01-01</td>
                            <td>Deposit</td>
                            <td>+1000.00</td>
                            <td>1000.00</td>
                        </tr>
                    </table>
                </div>
            </div>
            </div>
        </MainLayout>
    )
}