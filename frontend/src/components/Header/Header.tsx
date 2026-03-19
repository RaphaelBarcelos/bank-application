import { LogInButton, SignUpButton } from '../Buttons/Buttons';
import './Header.css'

const navItems = [
    { name: 'Home', href: '/' },
    { name: 'Companies', href: '/' },
    { name: 'Security', href: '/' },
    { name: 'Learn More', href: '/' },
];


export function Header() {
    const listNav = navItems.map((item) => (
        <li key={item.name}>
            <a href={item.href}>{item.name}</a>
        </li>
    ));

    return (
        <header>
            <div className='nav-text'>
                <h2 className="header-title">BankName</h2>
                <nav>
                    <ul className="header-nav">{listNav}</ul>
                </nav>
                <div className="header-buttons">
                    <LogInButton />
                    <SignUpButton />
                </div>
            </div>
        </header>
    )
}